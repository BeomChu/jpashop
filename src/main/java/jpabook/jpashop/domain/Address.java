package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected Address(){ // 필요한 기본생성자는 public보단 protected를 사용
    }

    public Address(String city, String street, String zipcode){ // setter제거하고 생성자에서 모든값을 초기화해서 생성함
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
