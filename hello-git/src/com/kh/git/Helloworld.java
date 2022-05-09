package com.kh.git;

/*
 * SCM Software Configuration Management
 * - 코드추적(버전관리) 외에 build, packaging, deploy등 프로젝트 관련 프로세스를 관리
 * 
 * VCS Version Control System
 * - 프로젝트 작성 / 수정 / 보완에 따른 변경내역을 버전으로 관리
 * 
 * 버전관리 프로그램
 * - server-client : 중앙저장소를 공유한 각각의 클라이언트(개발자)에서 저장소의 일부만 가져와서 작업 후, 중앙 저장소에 반영
 * 		- subversion
 * - 분산형 : 참여하는 각각의 클라이언트에서 전체저장소에 대한 복제본을 가지고 작업
 * 		- git
 * 
 */
public class Helloworld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
