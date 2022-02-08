package com.musucovery.study.di;

public class CartBar {

	
	public Ttekbokki buyTtekbokki(int money, boolean isCache) {
		System.out.println("떡볶이 주문이 들어왔습니다.");
		
		Ttekbokki ttekbokki = new Ttekbokki();
		cookTteokbokki();
		
		pay(money, isCache);
		System.out.println("손님에게 떡볶이를 건내줍니다.");
		
		return ttekbokki;
		
	}
	
	public FishCake buyFishCake(int money, boolean isCache) {
		
		System.out.println("오뎅주문이 들어왔습니다.");
		
		FishCake fishcake = new FishCake();
		
		cookFishCake();
		
		pay(money, isCache);
		System.out.println("손님에게 오뎅을 건내줍니다.");
		
		return fishcake;
	}
	
	/*
	 * 결제에 관한 로직을 따로 메서드로 분리
	 * */
	private void pay(int money, boolean isCache) {
		if(isCache) {
			System.out.println("현금"+money+"원을 받았습니다.");
		}else {
			System.out.println("신용카드를 통해" + money+"원을 결제 받았습니다.");
		}
	}
	
	//떡볶이 조리관련 메서드
	private void cookTteokbokki() {
		System.out.println("떡볶이 요리 중...");
		System.out.println("떡볶이 요리 완료.");
	}
	
	private void cookFishCake() {
		System.out.println("오뎅 조리중..");
		System.out.println("오뎅 조리 완료");
	}
}
