import java.util.Arrays;

public class Homework6 {
	public static void main(String[] args) 
	   {
	        double mass[]={1,2,3,4,5};
	        //sendByReference(mass);
	        //System.out.println(Arrays.toString(mass));
	        double[] a=sendByValue(mass);
	        System.out.println(Arrays.toString(mass));
	        System.out.println(Arrays.toString(a));  
	    }
	    
	    //Этот метод изменяет исходный массив. Так как массивы передаются по ссылке, то просто умножаем
	     public static void sendByReference(double[] mass)
	    {
	        for (int i = 0; i < mass.length; i++) {
	            mass[i] = mass[i]*1.1;
	        }
	    }
	    
	    //Этот метод возвращает новый массив
	    public static double[] sendByValue(double[] mas)
	    {
	        //Здесь делаем копию исходного массива
	        double[] mass=mas.clone();
	        for (int i = 0; i < mass.length; i++) {
	            mass[i] = mass[i]*1.1;
	        }
	        //Возвращаем новый массив
	        return mass;
	    }
	}
