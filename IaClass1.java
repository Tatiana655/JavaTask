public class IaClass1 {

    //неявная инициализация по умолчинию 0 (int) и null (String[]), если ничего не трогать внутри класса

    //можно дать значения каждой переменной внутри класса (вместо неявного инита)
    //Например (не зависит от public/static/pritected): int i = 5 ; String[] s = new String[5]; String[] s ={"ZERO","ONE"}; String[] s = new String[]{"ZERO", "ONE"}

    //можно вызвать методы/функции int i = foo(); String[] str = foo1();

    //Для статических переменных можно использовать статический блок  static{ isPub = 1; isPri = 1; isProt =1; }

    public int iPub;//неявно: ничего не менять (IPub : 0); Явно: iPub = 5; iPub = foo();
    private int iPriv ;//неявно: ничего не менять (IPub : 0); Явно: iPriv = 5; iPriv = foo();
    protected int iProt ;//неявно: ничего не менять (IPub : 0); Явно: iProt = 5; iProt = foo();

    public static int isPub ;//неявно: ничего не менять (IPub : 0); Явно: iPub = 5; iPub = foo(); статический блок static { iPub = 1;}
    private static int isPriv ;//неявно: ничего не менять (IPriv : 0); Явно: iPriv = 5; iPriv = foo(); статический блок static { iPriv = 1;}
    protected static int isProt ;//неявно: ничего не менять (IProt : 0); Явно: iProt  = 5; iProt  = foo(); статический блок static { iProt = 1;}
//+foo
    public String[] SPub ;//неявно: ничего не менять (SPub : null); Явно: SPub = new String[5]; SPub ={"ZERO","ONE"}; SPub = new String[]{"ZERO", "ONE"},
    private String[] SPriv;//неявно: ничего не менять (SPriv : null); Явно: SPriv = new String[5]; SPriv ={"ZERO","ONE"}; SPriv= new String[]{"ZERO", "ONE"}
    protected String[] SProt;//неявно: ничего не менять (SProt : null); Явно: SProt = new String[5]; SProt={"ZERO","ONE"}; SProt = new String[]{"ZERO", "ONE"}

    public static String[] SsPub;//неявно: ничего не менять (SsPub : null); Явно: SsPub = new String[5]; SsPub ={"ZERO","ONE"}; SsPub = new String[]{"ZERO", "ONE"}; статический блок static {...}
    private static String[] SsPriv;//неявно: ничего не менять (SsPriv : null); Явно: SsPriv = new String[5]; SsPriv ={"ZERO","ONE"}; SsPriv= new String[]{"ZERO", "ONE"}; статический блок static {...}
    protected static String[] SsProt;//неявно: ничего не менять (SsProt : null); Явно: SsProt = new String[5]; SsProt={"ZERO","ONE"}; SsProt = new String[]{"ZERO", "ONE"}; статический блок static {...}

    public void fooPub()
    {
        this.iPub += 1;
        this.iPriv += 1;
        this.iProt += 1;
        isPub +=1;
        isPriv +=1;
        isProt +=1;

        this.SPub = new String[2];
        this.SPriv = new String[2];
        this.SProt = new String[2];
        SsPub = new String[2];
        SsPriv = new String[2];
        SsProt = new String[2];
    }
    private void fooPriv()
    {
        this.iPub += 1;
        this.iPriv += 1;
        this.iProt += 1;
        isPub +=1;
        isPriv +=1;
        isProt +=1;

        this.SPub = new String[2];
        this.SPriv = new String[2];
        this.SProt = new String[2];
        SsPub = new String[2];
        SsPriv = new String[2];
        SsProt = new String[2];
    }
    protected void fooProt()
    {
        this.iPub += 1;
        this.iPriv += 1;
        this.iProt += 1;
        isPub +=1;
        isPriv +=1;
        isProt +=1;

        this.SPub = new String[2];
        this.SPriv = new String[2];
        this.SProt = new String[2];
        SsPub = new String[2];
        SsPriv = new String[2];
        SsProt = new String[2];
    }

    public static void foosPub()
    {
        this.iPub += 1;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        this.iPriv += 1;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        this.iProt += 1;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        isPub +=1;
        isPriv +=1;
        isProt +=1;

        this.SPub = new String[2];//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        this.SPriv = new String[2];//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        this.SProt = new String[2];//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        SsPub = new String[2];
        SsPriv = new String[2];
        SsProt = new String[2];
    }
    private static void foosPriv()
    {
        this.iPub += 1;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        this.iPriv += 1;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        this.iProt += 1;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        isPub +=1;
        isPriv +=1;
        isProt +=1;

        this.SPub = new String[2];//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        this.SPriv = new String[2];//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        this.SProt = new String[2];//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять CE
        SsPub = new String[2];
        SsPriv = new String[2];
        SsProt = new String[2];
    }
    protected static void foosProt()
    {
        this.iPub += 1;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        this.iPriv += 1;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        this.iProt += 1;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        isPub +=1;
        isPriv +=1;
        isProt +=1;

        this.SPub = new String[2];//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        this.SPriv = new String[2];//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        this.SProt = new String[2];//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        SsPub = new String[2];
        SsPriv = new String[2];
        SsProt = new String[2];
    }

    public void fooPub1()
    {
        int k = 0;
        k += this.iPub;
        k += this.iPriv ;
        k += this.iProt ;
        k += isPub ;
        k += isPriv ;
        k += isProt;

        boolean t =false;

        t = this.SPub == null;//так можно обратиться
        k = this.SPub.length;//так нельзя обратиться, если SPub : null с оставшимися аналогично
        t = this.SPriv==null;
        k = this.SPriv.length;
        t = this.SProt==null;
        k = this.SProt.length;
        t = SsPub == null;
        k = SsPub.length;
        t = SsPriv == null;
        k = SsPriv.length;
        t = SsProt == null;
        k = SsProt.length;
    }
    private void fooPriv1()
    {
        int k = 0;
        k += this.iPub;
        k += this.iPriv ;
        k += this.iProt ;
        k += isPub ;
        k += isPriv ;
        k += isProt;

        boolean t =false;

        t = this.SPub == null;//так можно обратиться
        k = this.SPub.length;//так нельзя обратиться, если SPub : null с оставшимися аналогично
        t = this.SPriv==null;
        k = this.SPriv.length;
        t = this.SProt==null;
        k = this.SProt.length;
        t = SsPub == null;
        k = SsPub.length;
        t = SsPriv == null;
        k = SsPriv.length;
        t = SsProt == null;
        k = SsProt.length;
    }
    protected void fooProt1()
    {
        int k = 0;
        k += this.iPub;
        k += this.iPriv ;
        k += this.iProt ;
        k += isPub ;
        k += isPriv ;
        k += isProt;

        boolean t =false;

        t = this.SPub == null;//так можно обратиться
        k = this.SPub.length;//так нельзя обратиться, если SPub : null с оставшимися аналогично
        t = this.SPriv==null;
        k = this.SPriv.length;
        t = this.SProt==null;
        k = this.SProt.length;
        t = SsPub == null;
        k = SsPub.length;
        t = SsPriv == null;
        k = SsPriv.length;
        t = SsProt == null;
        k = SsProt.length;
    }

    public static void foosPub1()
    {
        int k = 0;
        k += this.iPub;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k += this.iPriv ;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k += this.iProt ;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k += isPub ;
        k += isPriv ;
        k += isProt;

        boolean t =false;

        t = this.SPub == null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k = this.SPub.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        t = this.SPriv==null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k = this.SPriv.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        t = this.SProt==null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k = this.SProt.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        t = SsPub == null;//так можно обратиться
        k = SsPub.length;//так нельзя обратиться, если SPub : null с оставшимися аналогично
        t = SsPriv == null;
        k = SsPriv.length;
        t = SsProt == null;
        k = SsProt.length;
    }
    private static void foosPriv1()
    {
        int k = 0;
        k += this.iPub;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k += this.iPriv ;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k += this.iProt ;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k += isPub ;
        k += isPriv ;
        k += isProt;

        boolean t =false;

        t = this.SPub == null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k = this.SPub.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        t = this.SPriv==null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k = this.SPriv.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        t = this.SProt==null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k = this.SProt.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        t = SsPub == null;//так можно обратиться
        k = SsPub.length;//так нельзя обратиться, если SPub : null с оставшимися аналогично
        t = SsPriv == null;
        k = SsPriv.length;
        t = SsProt == null;
        k = SsProt.length;
    }
    protected static void foosProt1()
    {
        int k = 0;
        k += this.iPub;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k += this.iPriv ;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k += this.iProt ;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k += isPub ;
        k += isPriv ;
        k += isProt;

        boolean t =false;

        t = this.SPub == null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k = this.SPub.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        t = this.SPriv==null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k = this.SPriv.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        t = this.SProt==null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        k = this.SProt.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно то где менять
        t = SsPub == null;//так можно обратиться
        k = SsPub.length;//так нельзя обратиться, если SPub : null с оставшимися аналогично
        t = SsPriv == null;
        k = SsPriv.length;
        t = SsProt == null;
        k = SsProt.length;
    }
}
