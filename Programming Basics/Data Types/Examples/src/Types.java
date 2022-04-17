class Task {
    // Целые числа        [1]
    final byte variableByte = 127;                   // 8 бит
    final short variableShort = 32_767;              // 16 бит
    final int variableInt = 2_147_483_647;           // 32 бит
    final long variableLong = Long.MAX_VALUE;        // 64 бит

    // Вещественные числа [2]
    final float variableFloat = Float.MAX_VALUE;     // 32 бит
    final double variableDouble = Double.MAX_VALUE;  // 64 бит

    // Логический         [3]
    final boolean variableBoolean = false;           // 32 бит

    // Символьный         [4]
    final char variableChar = 'a';                   // 16 бит
}