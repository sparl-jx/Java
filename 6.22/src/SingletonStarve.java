public class SingletonStarve {
    //1，保存仅有对象
    private static final SingletonStarve instance;
    static {
        //2，饿汉模式，一开始就初始化   静态代码块or直接初始化都可以
        instance=new SingletonStarve();
    }
    //3，如果需要该类的对象，只能使用这个instance指向的对象，所以需要提供方法，把对象返回
    public static SingletonStarve getInstance() {
        return instance;
    }
    //4，尽可能避免有人无意中构造出该类的对象，把类的构造方法标记有private，减少误用的可能
    private SingletonStarve() {

    }
}
