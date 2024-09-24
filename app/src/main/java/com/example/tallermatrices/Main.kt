package com.example.tallermatrices

fun main(){
    do {
        val op: Int = menu()
        when(op){
            1 -> multiplicarMatriz()
            2 -> matrizCuadrada()
            3 -> matrizTraspuesta()
            4 -> matrizPromedios()
            5 -> matrizRala()
            6 -> matrizSumadaYMultiplicada()
            7 -> matrizModificada()
            8 -> matrizPositivosNegativos()
            9 -> matrizVentasCompania()
            10 -> matrizCalificaciones()
            11 -> matrizHorasTrabajadas()
            12 -> matriz12()
            13 -> matriz13()
            14 -> matriz14()
            15 -> matriz15()
            16 -> matriz16(io 
            17 -> matriz17()
            18 -> matriz18()
            19 -> matriz19(5)
            20 -> matriz20()
        }
    }while(op != -1)
}

fun menu() : Int{
        print("Seleccione la opción del ejercicio que desea ejecutar (1-20): ")
        val op = readlnOrNull()?.toIntOrNull() ?: -1
        return op
}

fun multiplicarMatriz() {
    print("Ingrese el número de filas: ")
    val filas =  readlnOrNull()?.toIntOrNull() ?: 5
    print("Ingrese el número de columnas: ")
    val columnas: Int = readlnOrNull()?.toIntOrNull() ?: 5
    print("Ingrese el valor multiplicador: ")
    val multiplicador = readlnOrNull()?.toIntOrNull() ?: 5


    val matriz = Array(filas) { Array(columnas) { 0 } }

    for (i in 0 until filas){
        for (j in 0 until columnas){
            print("Introduce el valor para la posición [$i][$j]: ")
            matriz[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }


    // Multiplicar los valores de la matriz por el multiplicador
    val matrizMultiplicada = Array(filas) { Array(columnas) { 0 } }
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            matrizMultiplicada[i][j] = matriz[i][j] * multiplicador
        }
    }

    // Imprimir la matriz resultante
    println("Matriz multiplicada por $multiplicador:")
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("${matrizMultiplicada[i][j]} ")
        }
        println()
    }
}

fun matrizCuadrada(){
    print("Ingrese el tamaño de la matriz cuadrada: ")
    val size = readlnOrNull()?.toIntOrNull() ?: 2

    // Crear la matriz
    val matriz = Array(size) { Array(size) { 0 } }

    // Leer los valores de la matriz
    for (i in 0 until size) {
        for (j in 0 until size) {
            print("Introduce el valor para la posición [$i][$j]: ")
            matriz[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Imprimir diagonal principal
    println("Diagonal principal:")
    for (i in 0 until size) {
        print("${matriz[i][i]} ")
    }
    println()

    // Imprimir diagonal secundaria
    println("Diagonal secundaria:")
    for (i in 0 until size) {
        print("${matriz[i][size - 1 - i]} ")
    }
    println()

    // Imprimir matriz triangular superior
    println("Matriz triangular superior:")
    for (i in 0 until size) {
        for (j in 0 until size) {
            if (i <= j) print("${matriz[i][j]} ") else print("0 ")
        }
        println()
    }

    // Imprimir matriz triangular inferior
    println("Matriz triangular inferior:")
    for (i in 0 until size) {
        for (j in 0 until size) {
            if (i >= j) print("${matriz[i][j]} ") else print("0 ")
        }
        println()
    }

}

fun matrizTraspuesta(){
    print("Ingrese el número de filas: ")
    val filas = readlnOrNull()?.toIntOrNull() ?: 3
    print("Ingrese el número de columnas: ")
    val columnas = readlnOrNull()?.toIntOrNull() ?: 3

    // Crear la matriz
    val matriz = Array(filas) { Array(columnas) { 0 } }

    // Leer los valores de la matriz
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("Introduce el valor para la posición [$i][$j]: ")
            matriz[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Crear la matriz transpuesta
    val transpuesta = Array(columnas) { Array(filas) { 0 } }

    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            transpuesta[j][i] = matriz[i][j]
        }
    }

    // Leer los valores de la matriz
    println("Matriz original: ")
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("${matriz[i][j]} ")
        }
        println()
    }
    // Imprimir la matriz transpuesta
    println("Matriz transpuesta:")
    for (i in 0 until columnas) {
        for (j in 0 until filas) {
            print("${transpuesta[i][j]} ")
        }
        println()
    }
}

fun matrizPromedios(){
    print("Ingrese el número de filas: ")
    val filas = readlnOrNull()?.toIntOrNull() ?: 3
    print("Ingrese el número de columnas: ")
    val columnas = readlnOrNull()?.toIntOrNull() ?: 3

    // Crear la matriz
    val matriz = Array(filas) { Array(columnas) { 0 } }

    // Leer los valores de la matriz
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("Introduce el valor para la posición [$i][$j]: ")
            matriz[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Verificar si es cuadrada
    if (filas == columnas) {
        println("La matriz es cuadrada.")
    } else {
        println("La matriz no es cuadrada.")
    }

    // Calcular y mostrar el promedio general
    var sumaTotal = 0
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            sumaTotal += matriz[i][j]
        }
    }
    val promedioTotal = sumaTotal.toDouble() / (filas * columnas)
    println("Promedio de todos los elementos: $promedioTotal")

    // Promedio por fila
    for (i in 0 until filas) {
        val sumaFila = matriz[i].sum()
        val promedioFila = sumaFila.toDouble() / columnas
        println("Promedio de la fila $i: $promedioFila")
    }

    // Promedio por columna
    for (j in 0 until columnas) {
        var sumaColumna = 0
        for (i in 0 until filas) {
            sumaColumna += matriz[i][j]
        }
        val promedioColumna = sumaColumna.toDouble() / filas
        println("Promedio de la columna $j: $promedioColumna")
    }
}

fun matrizRala(){
    // Pedir número de filas y columnas
    print("Ingrese el número de filas: ")
    val filas = readlnOrNull()?.toIntOrNull() ?: 3
    print("Ingrese el número de columnas: ")
    val columnas = readlnOrNull()?.toIntOrNull() ?: 3

    // Crear una matriz con valores iniciales de 0
    val matriz = Array(filas) { Array(columnas) { 0 } }

    // Llenar la matriz con valores proporcionados por el usuario
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("Introduce el valor para la posición [$i][$j]: ")
            matriz[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Verificar si la matriz es rala (1 en cada fila y columna)
    var esRala = true

    for (i in 0 until filas) {
        var countFila = 0 // Contar los "1" en cada fila
        for (j in 0 until columnas) {
            if (matriz[i][j] == 1) countFila++ // Si hay un 1, incrementar el contador
            if (matriz[i][j] != 0 && matriz[i][j] != 1) esRala =
                false // Si hay otro número que no sea 0 o 1, no es rala
        }
        if (countFila != 1) esRala = false // Si no hay exactamente un 1, no es rala
    }

    for (j in 0 until columnas) {
        var countColumna = 0 // Contar los "1" en cada columna
        for (i in 0 until filas) {
            if (matriz[i][j] == 1) countColumna++
        }
        if (countColumna != 1) esRala = false // Si no hay exactamente un 1 por columna, no es rala
    }

    // Resultado final
    if (esRala) {
        println("La matriz es rala.")
    } else {
        println("La matriz no es rala.")
    }
}

fun matrizSumadaYMultiplicada(){
    // Pedir tamaño de las matrices
    print("Ingrese el número de filas: ")
    val filas = readlnOrNull()?.toIntOrNull() ?: 3
    print("Ingrese el número de columnas: ")
    val columnas = readlnOrNull()?.toIntOrNull() ?: 3

    // Crear y llenar la primera matriz
    val matrizA = Array(filas) { Array(columnas) { 0 } }
    println("Llenar la primera matriz:")
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("Introduce el valor para la posición [$i][$j] en la matriz A: ")
            matrizA[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Crear y llenar la segunda matriz
    val matrizB = Array(filas) { Array(columnas) { 0 } }
    println("Llenar la segunda matriz:")
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("Introduce el valor para la posición [$i][$j] en la matriz B: ")
            matrizB[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Sumar ambas matrices
    val matrizSuma = Array(filas) { Array(columnas) { 0 } }
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j]
        }
    }

    // Multiplicar ambas matrices
    val matrizMultiplicacion = Array(filas) { Array(columnas) { 0 } }
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            matrizMultiplicacion[i][j] = matrizA[i][j] * matrizB[i][j]
        }
    }

    // Imprimir las matrices resultantes
    println("Matriz suma:")
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("${matrizSuma[i][j]} ")
        }
        println()
    }

    println("Matriz multiplicación:")
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("${matrizMultiplicacion[i][j]} ")
        }
        println()
    }
}

fun matrizModificada(){
    // Pedir número de filas y columnas
    println("Ingrese el número de filas: ")
    val filasInput = readLine()
    val filas = if (filasInput != null && filasInput.toIntOrNull() != null) filasInput.toInt() else 3

    println("Ingrese el número de columnas: ")
    val columnasInput = readLine()
    val columnas = if (columnasInput != null && columnasInput.toIntOrNull() != null) columnasInput.toInt() else 3

    // Crear la matriz y llenarla con valores ingresados por el usuario
    var matriz = Array(filas) { Array(columnas) { 0 } }
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            println("Introduce el valor para la posición [$i][$j]: ")
            val valorInput = readLine()
            matriz[i][j] = if (valorInput != null && valorInput.toIntOrNull() != null) valorInput.toInt() else 0
        }
    }

    // Imprimir la matriz original
    println("Matriz original:")
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("${matriz[i][j]} ")
        }
        println()
    }

    // Eliminar fila
    println("Ingrese el índice de la fila que desea eliminar (0 a ${filas - 1}): ")
    val filaEliminarInput = readLine()
    val filaEliminar = if (filaEliminarInput != null && filaEliminarInput.toIntOrNull() != null) filaEliminarInput.toInt() else 0
    val matrizSinFila = Array(filas - 1) { Array(columnas) { 0 } }

    var contadorFilas = 0
    for (i in 0 until filas) {
        if (i != filaEliminar) {
            for (j in 0 until columnas) {
                matrizSinFila[contadorFilas][j] = matriz[i][j]
            }
            contadorFilas++
        }
    }

    // Imprimir la matriz sin la fila eliminada
    println("Matriz sin la fila $filaEliminar:")
    for (i in 0 until filas - 1) {
        for (j in 0 until columnas) {
            print("${matrizSinFila[i][j]} ")
        }
        println()
    }

    // Eliminar columna
    println("Ingrese el índice de la columna que desea eliminar (0 a ${columnas - 1}): ")
    val columnaEliminarInput = readLine()
    val columnaEliminar = if (columnaEliminarInput != null && columnaEliminarInput.toIntOrNull() != null) columnaEliminarInput.toInt() else 0
    val matrizSinColumna = Array(filas - 1) { Array(columnas - 1) { 0 } }

    for (i in 0 until filas - 1) {
        var contadorColumnas = 0
        for (j in 0 until columnas) {
            if (j != columnaEliminar) {
                matrizSinColumna[i][contadorColumnas] = matrizSinFila[i][j]
                contadorColumnas++
            }
        }
    }

    // Imprimir la matriz sin la columna eliminada
    println("Matriz sin la columna $columnaEliminar:")
    for (i in 0 until filas - 1) {
        for (j in 0 until columnas - 1) {
            print("${matrizSinColumna[i][j]} ")
        }
        println()
    }

    // Insertar una nueva fila
    println("Ingrese el índice donde desea insertar una nueva fila (0 a ${filas - 1}): ")
    val filaInsertarInput = readLine()
    val filaInsertar = if (filaInsertarInput != null && filaInsertarInput.toIntOrNull() != null) filaInsertarInput.toInt() else 0
    val nuevaFila = Array(columnas - 1) { 0 }

    for (j in 0 until (columnas - 1)) {
        println("Introduce el valor para la nueva fila en la posición [$filaInsertar][$j]: ")
        val valorFilaNueva = readLine()
        nuevaFila[j] = if (valorFilaNueva != null && valorFilaNueva.toIntOrNull() != null) valorFilaNueva.toInt() else 0
    }

    val matrizConFilaInsertada = Array(filas) { Array(columnas - 1) { 0 } }
    var nuevaFilaInsertada = 0

    for (i in 0 until filas) {
        if (i == filaInsertar) {
            for (j in 0 until (columnas - 1)) {
                matrizConFilaInsertada[i][j] = nuevaFila[j]
            }
        } else {
            for (j in 0 until (columnas - 1)) {
                matrizConFilaInsertada[i][j] = matrizSinColumna[nuevaFilaInsertada][j]
            }
            nuevaFilaInsertada++
        }
    }

    // Imprimir la matriz con la nueva fila
    println("Matriz con la fila $filaInsertar insertada:")
    for (i in 0 until filas) {
        for (j in 0 until columnas - 1) {
            print("${matrizConFilaInsertada[i][j]} ")
        }
        println()
    }

    // Insertar una nueva columna
    println("Ingrese el índice donde desea insertar una nueva columna (0 a ${columnas - 1}): ")
    val columnaInsertarInput = readLine()
    val columnaInsertar = if (columnaInsertarInput != null && columnaInsertarInput.toIntOrNull() != null) columnaInsertarInput.toInt() else 0

    val matrizConColumnaInsertada = Array(filas) { Array(columnas) { 0 } }

    for (i in 0 until filas) {
        var contadorCol = 0
        for (j in 0 until columnas) {
            if (j == columnaInsertar) {
                println("Introduce el valor para la nueva columna en la posición [$i][$j]: ")
                val valorColNueva = readLine()
                matrizConColumnaInsertada[i][j] = if (valorColNueva != null && valorColNueva.toIntOrNull() != null) valorColNueva.toInt() else 0
            } else {
                matrizConColumnaInsertada[i][j] = matrizConFilaInsertada[i][contadorCol]
                contadorCol++
            }
        }
    }

    // Imprimir la matriz con la nueva columna
    println("Matriz con la columna $columnaInsertar insertada:")
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("${matrizConColumnaInsertada[i][j]} ")
        }
        println()
    }
}

fun matrizPositivosNegativos(){
    val matriz = arrayOf(
        intArrayOf(-1, 2, 3),
        intArrayOf(4, -5, 6),
        intArrayOf(7, 8, -9)
    )

    println("Matriz original:")
    matriz.forEach { println(it.joinToString(" ")) }

    // Reemplazar negativos por 0 y positivos por 9
    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            matriz[i][j] = if (matriz[i][j] < 0) 0 else 9
        }
    }

    println("Matriz modificada:")
    matriz.forEach { println(it.joinToString(" ")) }
}

fun matrizVentasCompania(){
    val n = 3 // Sucursales
    val m = 12 // Meses
    val ventas = arrayOf(
        intArrayOf(500, 600, 450, 700, 400, 550, 610, 720, 530, 470, 580, 590),
        intArrayOf(700, 620, 480, 710, 410, 570, 630, 730, 540, 480, 590, 600),
        intArrayOf(800, 640, 490, 720, 420, 580, 640, 740, 550, 490, 600, 610)
    )

    var totalVentas = 0
    val totalPorSucursal = IntArray(n)
    var sucursalMax = 0
    var maxVentasSucursal = 0
    var mesMin = 0
    var minVentasMes = Int.MAX_VALUE

    // Calcular total de ventas, ventas por sucursal, y sucursal con más ventas
    for (i in 0 until n) {
        var ventasSucursal = 0
        for (j in 0 until m) {
            totalVentas += ventas[i][j]
            ventasSucursal += ventas[i][j]
        }
        totalPorSucursal[i] = ventasSucursal
        if (ventasSucursal > maxVentasSucursal) {
            maxVentasSucursal = ventasSucursal
            sucursalMax = i
        }
    }

    // Calcular mes con menos ventas
    for (j in 0 until m) {
        var ventasMes = 0
        for (i in 0 until n) {
            ventasMes += ventas[i][j]
        }
        if (ventasMes < minVentasMes) {
            minVentasMes = ventasMes
            mesMin = j
        }
    }

    println("Total de ventas de la compañía: $totalVentas")
    for (i in 0 until n) {
        println("Total de ventas de la sucursal ${i + 1}: ${totalPorSucursal[i]}")
    }
    println("La sucursal que más vendió fue la sucursal ${sucursalMax + 1} con $maxVentasSucursal ventas.")
    println("El mes con menos ventas fue el mes ${mesMin + 1} con $minVentasMes ventas.")
}

fun matrizCalificaciones(){
    val m = 3 // Número de estudiantes
    val calificaciones = arrayOf(
        intArrayOf(70, 80, 90, 60, 50, 40),
        intArrayOf(80, 90, 85, 70, 65, 60),
        intArrayOf(60, 70, 75, 85, 95, 100)
    )

    // a) Promedio de cada estudiante
    for (i in calificaciones.indices) {
        val promedio = calificaciones[i].average()
        println("Promedio del estudiante ${i + 1}: $promedio")
    }

    // b) Estudiantes que aprobaron/reprobaron cada materia
    val aprobados = IntArray(6)
    val reprobados = IntArray(6)

    for (j in 0 until 6) {
        for (i in 0 until m) {
            if (calificaciones[i][j] >= 60) {
                aprobados[j]++
            } else {
                reprobados[j]++
            }
        }
    }

    for (j in 0 until 6) {
        println("Materia ${j + 1}: ${aprobados[j]} estudiantes aprobaron y ${reprobados[j]} estudiantes reprobaron.")
    }

    // c) Promedio de cada materia
    for (j in 0 until 6) {
        var sumaMateria = 0
        for (i in 0 until m) {
            sumaMateria += calificaciones[i][j]
        }
        println("Promedio de la materia ${j + 1}: ${sumaMateria / m}")
    }
}

fun matrizHorasTrabajadas(){
    val empleados = arrayOf(
        intArrayOf(1, 8, 2), // Código del empleado, horas normales, horas extra
        intArrayOf(2, 7, 3),
        intArrayOf(3, 6, 1)
    )

    val pagoHoraNormal = 2350
    val pagoHoraExtra = 3500

    println("Informe de empleados:")
    for (empleado in empleados) {
        val codigo = empleado[0]
        val horasNormales = empleado[1]
        val horasExtra = empleado[2]

        val totalNormal = horasNormales * pagoHoraNormal
        val totalExtra = horasExtra * pagoHoraExtra
        val totalPago = totalNormal + totalExtra

        println("Empleado código: $codigo")
        println("Horas normales trabajadas: $horasNormales, Pago por horas normales: $totalNormal")
        println("Horas extra trabajadas: $horasExtra, Pago por horas extra: $totalExtra")
        println("Pago total: $totalPago\n")
    }
}

fun matriz12(){
    println("Ingrese el tamaño N de la matriz (N debe ser impar y mayor que 3):")
    val n = readlnOrNull()?.toIntOrNull() ?: 5

    if (n % 2 == 0 || n <= 3) {
        println("N debe ser un número impar y mayor que 3.")
        return
    }

    val matriz = Array(n) { IntArray(n) { 0 } }

    // Llenar la matriz con el ejemplo
    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = j // Puedes modificar esto para el patrón deseado
        }
    }

    // Mostrar la matriz
    for (i in 0 until n) {
        for (j in 0 until n) {
            print("${matriz[i][j]} ")
        }
        println()
    }
}

fun matriz13(){
    val n = 5 // Solo valores impares mayores que 3
    val matriz = Array(n) { IntArray(n) }

    // Llenar la matriz con el patrón del ejemplo
    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = if (i == 0 || j == 0 || i == n - 1 || j == n - 1) 1 else 0
        }
    }

    // Mostrar la matriz
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}

fun matriz14(){
    val n = 5 // Solo valores impares mayores que 3
    val matriz = Array(n) { IntArray(n) }

    // Llenar la matriz con el patrón del ejemplo
    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = if (i == j) i + 1 else 0
        }
    }

    // Mostrar la matriz
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}

fun matriz15(){
    val n = 5
    val matriz = Array(n) { IntArray(n) }

    // Llenar la matriz con el patrón del ejemplo
    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = i * j // Cambia esta lógica según el patrón que necesites
        }
    }

    // Mostrar la matriz
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}

fun matriz16(){
    val n = 5
    val matriz = Array(n) { IntArray(n) }

    // Llenar la matriz con el patrón
    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = if (i % 2 == 0) j + 1 else n - j
        }
    }

    // Mostrar la matriz
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}

fun matriz17(){
    val n = 5
    val matriz = Array(n) { IntArray(n) }

    // Llenar la matriz con el patrón del ejemplo
    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = if (i == j || i + j == n - 1) 1 else 0
        }
    }

    // Mostrar la matriz
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}

fun matriz18(){
    val n = 5
    val matriz = Array(n) { IntArray(n) }

    // Llenar la matriz con el patrón del ejemplo
    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = if (i == j) i else j
        }
    }

    // Mostrar la matriz
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}

fun matriz19(n: Int){
    // Crear una matriz vacía de n x n
    val matrix = Array(n) { Array(n) { 0 } }
    var value = 1

    // Definir los límites
    var left = 0
    var right = n - 1
    var top = 0
    var bottom = n - 1

    while (left <= right && top <= bottom) {
        // Llenar de derecha a izquierda en la parte superior
        for (i in left..right) {
            matrix[top][i] = value++
        }
        top++

        // Llenar de arriba hacia abajo en la parte derecha
        for (i in top..bottom) {
            matrix[i][right] = value++
        }
        right--

        // Llenar de izquierda a derecha en la parte inferior
        if (top >= bottom) {
            for (i in right downTo left) {
                matrix[bottom][i] = value++
            }
            bottom--
        }

        // Llenar de abajo hacia arriba en la parte izquierda
        if (left >= right) {
            for (i in bottom downTo top) {
                matrix[i][left] = value++
            }
            left++
        }
    }

    for (row in matrix) {
        for (value in row) {
            print("$value\t")
        }
        println()
    }
}

fun matriz20(){
    val n = 5
    val matriz = Array(n) { IntArray(n) }
    var value = 1
    var x = 0
    var y = 0
    var direction = 0

    while (value <= n * n) {
        matriz[x][y] = value++
        when (direction) {
            0 -> if (y + 1 < n && matriz[x][y + 1] == 0) y++ else {
                direction = 1; x++
            }
            1 -> if (x + 1 < n && matriz[x + 1][y] == 0) x++ else {
                direction = 2; y--
            }
            2 -> if (y - 1 >= 0 && matriz[x][y - 1] == 0) y-- else {
                direction = 3; x--
            }
            3 -> if (x - 1 >= 0 && matriz[x - 1][y] == 0) x-- else {
                direction = 0; y++
            }
        }
    }

    // Mostrar la matriz
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}