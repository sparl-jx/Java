public class SingletonLazy {
    //1，需要保存该类唯一对象的引用
    private static SingletonLazy instance=null;
    public static SingletonLazy getInstance() {
        //getInstance被调用的时候，代表有人需要该类的对象，所以应该实例出对象—按需加载
       /* if(instance==null) {
            //先初始化代表对象
            instance=new SingletonLazy();
            return instance;
        } else {
            //代表instance已经指向了一个对象，我们不需要再实例化对象，直接返回该对象的引用即可
            return instance;
        */
        if(instance==null) {
            instance=new SingletonLazy();
        }
        return instance;
    }
}
