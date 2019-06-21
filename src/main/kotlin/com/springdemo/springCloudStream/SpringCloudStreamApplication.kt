package com.springdemo.springCloudStream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.messaging.Source
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.stereotype.Component

@SpringBootApplication
class SpringCloudStreamApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudStreamApplication>(*args)
}

@EnableBinding(Source::class)
@EnableScheduling
class vendorShipper(val source: Source, val generator: vendorSupplier) {

}

@Component
class vendorSupplier {

}
