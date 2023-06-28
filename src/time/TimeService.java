package time;

import java.text.SimpleDateFormat;
import java.util.*;

public class TimeService {
	private TimeDTO dto;

	public TimeService() {
		// System.out.println("기본 생성자 실행");
		dto = new TimeDTO();
	}

	

	public void setStartTime() {
		System.out.println("** 서비스 시간설정 **");
		long start = System.currentTimeMillis();
		dto.setStart(start);

		// date = simple.format(d);
		// System.out.println(date);
	}

	public String getStartTime() {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		if (dto.getStart() == 0) {
			return "\"시간설정이 필요합니다.\"";
		} else {

			String sTime = simple.format(dto.getStart());
			return sTime;
		}
	}

	public void setEndTime() {
		//System.out.println("** 종료시간설정 **");
		long end = System.currentTimeMillis();
		dto.setEnd(end);

		dto.setTotal((end - dto.getStart()) / 1000);
	}

	public String getEndTime() {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String eTime = simple.format(dto.getEnd());
		return eTime;

	}

	public String getResultTime() {
	//	System.out.println(dto.getTotal() + "초 사용");
		long total = dto.getTotal();
		int m = (int) total / 60;
		int s=(int) total%60;
		return m+"분"+s+"초 사용";
	}

}
