package spring.advanced.app.v5;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import spring.advanced.trace.callback.TraceCallback;
import spring.advanced.trace.callback.TraceTemplate;
import spring.advanced.trace.logtrace.LogTrace;
import spring.advanced.trace.template.AbstractTemplate;

@Repository
public class OrderRepositoryV5 {

    private final TraceTemplate traceTemplate;

    public OrderRepositoryV5(LogTrace trace) {
        this.traceTemplate = new TraceTemplate(trace);
    }

    public void save(String itemId) {

        traceTemplate.execute("OrderRepository.save()", new TraceCallback<Void>() {
            @Override
            public Void call() {
                if (itemId.equals("ex")) {
                    throw new IllegalStateException("예외 발생");
                }
                sleep(1000);
                return null;
            }
        });

    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) { // 현재 실행중인 스레드에게 작업중단 요청
            e.printStackTrace();
        }
    }
}
