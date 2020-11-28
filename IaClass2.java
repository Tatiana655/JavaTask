public class IaClass2 {

        public final int iPub = 1;//неявно: нельзя; Явно: iPub = 5; iPub = foo(); или в блоке { iPub = 1 } одновременно и там и там нельзя CE. и так для нестатических 3 с примитивов
        private final int iPriv ;
        {
            iPriv = 1;
        }
        protected final int iProt=1;
        public static final int isPub;//неявно: нельзя; Явно: iPub = 5; iPub = foo(); или в статическом блоке static{ iPub = 1 } одновременно и там и там нельзя CE. и так для  3 статических примитивов
        static { isPub =1;}
        private static final int isPriv =1 ;
        protected static final int isProt =1 ;

        public final String[] SPub  ;//неявно: нелья; Явно: SPub = new String[5]; SPub ={"ZERO","ONE"}; SPub = new String[]{"ZERO", "ONE"} или в блоке { SPub = new String[]{"ZERO"};} или { SPub = new String[2];} и так для 3 нестатических ссылочных массивов
    {
        SPub = new String[2];
    }
        private final String[] SPriv = new String[2];
        protected final String[] SProt = new String[]{"ZERO", "ONE"};

        public final static String[] SsPub = new String[2];//неявно: нелья; Явно: SPub = new String[5]; SPub ={"ZERO","ONE"}; SPub = new String[]{"ZERO", "ONE"} или в статическом блоке static{ SPub = new String[]{"ZERO"};} или { SPub = new String[2];}и так для 3 статических ссылочных массивов
        private final static String[] SsPriv = null;
        protected final static String[] SsProt = new String[]{"ZERO", "ONE"};

        public void fooPub()
        {
            //СЕ т.к. все они final (константы) изменять значения в них нельзя
            this.iPub = 1;
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
            //СЕ т.к. все они final (константы) изменять значения в них нельзя
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
            //СЕ т.к. все они final (константы) изменять значения в них нельзя
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
            //СЕ т.к. все они final (константы) изменять значения в них нельзя
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
            //СЕ т.к. все они final (константы) изменять значения в них нельзя
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
        protected static void foosProt()
        {
            //СЕ т.к. все они final (константы) изменять значения в них нельзя
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
            //Можно обратиться ко всем, если они не null (сравнить с null можно) (А зачем null константа? Но сделать её можно)
            t = this.SPub == null;
            k = this.SPub.length;
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
            //Можно обратиться ко всем, если они не null (сравнить с null можно) (А зачем null константа? Но сделать её можно)
            t = this.SPub == null;
            k = this.SPub.length;
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
            //Можно обратиться ко всем, если они не null (сравнить с null можно) (А зачем null константа? Но сделать её можно)
            t = this.SPub == null;
            k = this.SPub.length;
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
            k += this.iPub;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            k += this.iPriv ;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            k += this.iProt ;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            k += isPub ;
            k += isPriv ;
            k += isProt;

            boolean t =false;

            t = this.SPub == null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            k = this.SPub.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции нне понятно откуда её взять
            t = this.SPriv==null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции нне понятно откуда её взять
            k = this.SPriv.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            t = this.SProt==null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            k = this.SProt.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            //Можно обратиться ко всем, если они не null (сравнить с null можно) (А зачем null константа? Но сделать её можно)
            t = SsPub == null;
            k = SsPub.length;
            t = SsPriv == null;
            k = SsPriv.length;
            t = SsProt == null;
            k = SsProt.length;
        }
        private static void foosPriv1()
        {
            int k = 0;
            k += this.iPub;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            k += this.iPriv ;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            k += this.iProt ;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            k += isPub ;
            k += isPriv ;
            k += isProt;

            boolean t =false;

            t = this.SPub == null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            k = this.SPub.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            t = this.SPriv==null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            k = this.SPriv.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            t = this.SProt==null;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            k = this.SProt.length;//Данная переменная принадлежит конкретному экземпляру класса. А со статической функции не понятно откуда её взять
            //Можно обратиться ко всем, если они не null (сравнить с null можно) (А зачем null константа? Но сделать её можно)
            t = SsPub == null;
            k = SsPub.length;
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
            //Можно обратиться ко всем, если они не null (сравнить с null можно) (А зачем null константа? Но сделать её можно)
            t = SsPub == null;
            k = SsPub.length;
            t = SsPriv == null;
            k = SsPriv.length;
            t = SsProt == null;
            k = SsProt.length;
        }
}
