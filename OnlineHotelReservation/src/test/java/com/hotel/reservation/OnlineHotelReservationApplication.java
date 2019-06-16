package com.hotel.reservation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fuyoubank.EnableJpaRepositories;
import com.fuyoubank.repository.base.BaseRepositoryFactoryBean;
 

 

//@EnableJpaRepositories(basePackages = { "com.hotel.reservation" }, repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class// 指定自己的工厂类
//)
@SpringBootApplication
public class OnlineHotelReservationApplication {
	public static void main(String[] args) {
		SpringApplication.run(OnlineHotelReservationApplication.class, args); 
	}


}
