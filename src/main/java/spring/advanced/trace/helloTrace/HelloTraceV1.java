package spring.advanced.trace.helloTrace;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import spring.advanced.trace.TraceId;
import spring.advanced.trace.TraceStatus;

@Slf4j
@Component
public class HelloTraceV1 {

    private static final String START_PREFIX = "-->";
    private static final String COMPLETE_PREFIX = "<--";
    private static final String EX_PREFIX = "<X-";

    public TraceStatus begin(String meaage) {
        TraceId traceId = new TraceId();
        long startTimeMs = System.currentTimeMillis();
        log.info("[{}] {}{}", traceId.getId(), addSpace(START_PREFIX, traceId.getLevel()), meaage);
        return new TraceStatus(traceId, startTimeMs, meaage);
    }

    public void end(TraceStatus status) {
        complete(status, null);
    }

    public void exception(TraceStatus status, Exception e) {
        complete(status, e);
    }

    private static String addSpace(String prefix, int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append((i==level-1) ? "|" + prefix : "|   ");
        }
        return sb.toString();
    }

    private void complete(TraceStatus status, Exception e) {
        long stopTimeMs = System.currentTimeMillis();
        long resultTimeMs = stopTimeMs - status.getStartTimeMs();
        TraceId traceId = status.getTraceId();
        if (e == null) {
            log.info("[{}] {}{} time={}ms",
                    traceId.getId(), addSpace(COMPLETE_PREFIX, traceId.getLevel()), status.getMessage(), resultTimeMs);
        } else  {
            log.info("[{}] {}{} time={}ms ex={}",
                    traceId.getId(), addSpace(EX_PREFIX, traceId.getLevel()), status.getMessage(), resultTimeMs, e.toString());
        }
    }
}
