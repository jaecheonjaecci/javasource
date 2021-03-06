import org.omg.CORBA.portable.ValueBase;

//24시간 = 1<<0  : 1
//주차 = 1<<1 : 2
//흡연실 = 1<<2 : 4
//와이파이= 1<<3 : 8
//배달 = 1<<4 : 16 
public class ShiftOperatorMain {
public static void main(String[] args) {
	int value = 30;
	
	if (value >= (1<<4)) {
		System.out.println("배달");
		value -= 1<<4;
	}
	if (value >= 1<<3) {
		System.out.println("와이파이");
		value -= 1<<3;
	}
	if (value >= 1<<2) {
		System.out.println("흡연실");
		value -= 1<<2;
	}
	if (value >= 1<<1) {
		System.out.println("주차");
		value -= 1<<1;
	}
	if (value >= 1<<0) {
		System.out.println("24시간");
		value -= 1<<0;
	}
}
}