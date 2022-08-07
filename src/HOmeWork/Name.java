package HOmeWork;

public interface Name<T extends AbsClient> {

    default String getName(T ttt){
        return ttt.name;
    }

}
