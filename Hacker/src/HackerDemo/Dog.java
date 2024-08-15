package HackerDemo;
/* 1)实现一个比较两狗体重的静态方法和与一只特定的狗比较的实例方法
   2）声明一个静态字面量赋值狗的学名
 */
public class Dog {
    public int Weight;

    public static String xueming="Great Sky Dog";

    public Dog(int w){
        Weight=w;
    }

    public void makenoise() {
        if (Weight<10){
            System.out.println("yepyepyep");
        }else if (Weight>30){
            System.out.println("ahahah");
        }else {
            System.out.println("wooooooooo");
        }
    }

    public static Dog maxdog(Dog d1,Dog d2){
        if (d1.Weight>d2.Weight){
            return d1;
        }else {
            return d2;
        }
    }

    public Dog maxdog(Dog d2){
        if (this.Weight>d2.Weight){
            return this;
        }
        return d2;
    }
}
