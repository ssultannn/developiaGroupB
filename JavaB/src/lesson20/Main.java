package lesson20;

public class Main {
	public static void main(String[] args) {
//		String s = "hello";
//		String s2 = s.concat(" World");
//		System.out.println(s2);

    	//добавляет в конец строки
		StringBuilder sBuilder=new StringBuilder("привет");
		sBuilder.append(" мир");
		System.out.println(sBuilder);

		// вставляет текст в указанную позицию
		StringBuilder sBuilder2=new StringBuilder("привет   vbh");
		sBuilder2.insert(6, "мир");
		System.out.println(sBuilder2);

		// заменяет часть текста на новый
		StringBuilder sBuilder3=new StringBuilder("добрый день");
		sBuilder3.replace(7, 11, "вечер");
		System.out.println(sBuilder3);

		// удаляет часть текста
		StringBuilder sBuilder4=new StringBuilder("привет мир");
		sBuilder4.delete(0, 7);
		System.out.println(sBuilder4);

		// переворачивает строку
		StringBuilder sBuilder5=new StringBuilder("Java");
		sBuilder5.reverse();
		System.out.println(sBuilder5);

		StringBuilder sBuilder6 = new StringBuilder("привет");
		//назначаем длину
		sBuilder6.setLength(3);
		System.out.println(sBuilder6);
		//возвращает символ по индексу
		char ch = sBuilder6.charAt(1);
		System.out.println(ch);
		
		//возвращает часть строки 
		StringBuilder stringBuilder=new StringBuilder("привет мир");
		System.out.println(stringBuilder.substring(7,10));
	

	}
}
