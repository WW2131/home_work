package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Bonnie
 * 使用StringBuilder完成
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("大家好!");
		System.out.println(stringBuilder.append("我是程序员!"));
		System.out.println(stringBuilder.insert(stringBuilder.indexOf("是")+1,"优秀的"));
		System.out.println(stringBuilder.replace(stringBuilder.indexOf("是")+1,stringBuilder.lastIndexOf("的"),"牛牛"));
		System.out.println(stringBuilder.delete(stringBuilder.indexOf("大"),stringBuilder.indexOf("!")+1));
	}
}
