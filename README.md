# PREGUNTAS ANALISIS:

 Análisis inicial — responde antes de continuar 
 
a)	¿Cuántas líneas imprime la ejecución? ¿En qué orden aparecen? 
-	Imprime 8 lineas, En orden descendente de mayor a menor puesto que empieza en 8
      
b)	El método de TimerTask se llama run(). ¿Eso lo convierte ya en un hilo? Justifica. 
-	No, que se llame run no lo convierte un hilo, para que sea un hilo se requiere que el objeto este vinculado al ciclo de vida del procesador a través de la clase Thread.
      
c)	Si agregas un segundo temporizador con timerA.run(); timerB.run(); ¿qué esperas que pase? 
-	Si se agrega otro temporizador, se ejecutaran de forma secuencial, es decir, primero se imprime el timerA, y al acabar este, empezara el timerB.
     
