package com.example.monoandflux.restcontroller;

import com.example.monoandflux.model.CustomerEvent;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

@RestController
public class CustomerRestController {

//    @GetMapping("/event")
//    public Mono<CustomerEvent> getCustomerEvent(){
//        CustomerEvent customerEvent = new CustomerEvent("sai",new Date());
//        Mono<CustomerEvent> monoObject = Mono.just(customerEvent);
//        return monoObject;
//    }
//
//    @GetMapping(value="/events",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public ResponseEntity<Flux<CustomerEvent>> getCustomerEvents(){
//        CustomerEvent customerEvent = new CustomerEvent("sai",new Date());
//        Stream<CustomerEvent> customerStream = Stream.generate(() -> customerEvent);
//        Flux<CustomerEvent> customerEventFlux = Flux.fromStream(customerStream);
//        Flux<Long> interval = Flux.interval(Duration.ofSeconds(3));
//        Flux<Tuple2<Long, CustomerEvent>> zip = Flux.zip(interval, customerEventFlux);
//        Flux<CustomerEvent> map = zip.map(Tuple2::getT2);
//        return new ResponseEntity<>(map, HttpStatus.OK);
//    }

}
