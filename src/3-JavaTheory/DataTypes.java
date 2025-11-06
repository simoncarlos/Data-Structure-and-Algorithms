public class DataTypes {

    public static void PrimitiveVariables () {

        // Valores simples que se almacenan directamente  en memoria
        
        boolean variableBoolean = true;     // 1  bit   ->  0 o 1
        byte variableByte = 0;              // 8  bits  ->  0 a 8
        short variableShort = 0;            // 16 bits  ->  -32,768 a 32,767  
        char variableChart = 'a';           // 16 bits  ->  Unicode (0 a 65535)
        int variableInt = 1;                // 32 bits  ->  ± 2 mil millones
        float variableFloat = 1.234e2f;     // 32 bits  ->  Precisión simple (7 decimales)
        long variableLong = 1234L;          // 64 bits  ->  ± 9 x $10^{18}$
        double variableDouble = 1;          // 64 bits  ->  Precisión doble (15 decimales)  
        
        // Cuentan con un valor predeterminado de '', 0 o false
    }
    
    public static void WrapperClasses(){

        // referencias que apuntan a un objeto en la memoria
    }
}
