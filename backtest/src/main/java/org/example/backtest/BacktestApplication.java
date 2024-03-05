package org.example.backtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EntityScan({
        "org.example",
})
public class BacktestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BacktestApplication.class, args);
    }

}
