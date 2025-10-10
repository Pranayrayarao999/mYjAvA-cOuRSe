package J.Day13;

public class Inheritence {
    //types of inheritence , 1.single level , 2. multi level , 3. hierarchy level , 4. hybrid level
    //Multiple level Inheritence is not supported in java, it is supported in python

    public void left(){
        System.out.println("CAR IS GOING LEFT");
    }

    public void right(){
        System.out.println("CAR IS GOING RIGHT");
    }

    public static void main(String[] args) {
        Inheritence i = new Inheritence();
        i.left();
        i.right();
    }
}

class SingleLevelInheritence extends Inheritence {
    public void Hello(){
        System.out.println("SINGLE-LEVEL INHERITENCE");
    }

    public void left(){
        System.out.println("SINGLE LEVEL -LEFT OVERIDING");
    }

    public static void main(String[] args) {
        SingleLevelInheritence sl = new SingleLevelInheritence();
        sl.Hello();
        sl.left();
        sl.right();
    }
}

class MultiLevelInheritence extends SingleLevelInheritence {
        public void Hi(){
            System.out.println("MULTILEVEL INHERITENCE");
        }
    public static void main(String[] args) {
        MultiLevelInheritence ml = new MultiLevelInheritence();
        ml.Hi();
        ml.Hello();
        ml.left();
        ml.right();
    }
}

class HierarchyLevelInheritence extends Inheritence  {
        public void haha(){
            System.out.println("HIERARCHICAL LEVEL INHERITANCE");
        }
    public static void main(String[] args) {
        HierarchyLevelInheritence hle = new HierarchyLevelInheritence();
        hle.haha();
        hle.left();
        hle.right();
    }
}

//HYBRID LEVEL INHERITENCE IS THE COMBINATION OF 2 TYPES OF INHERITENCE IT CAN SINGLE, MULTI, HIERARCHICAL