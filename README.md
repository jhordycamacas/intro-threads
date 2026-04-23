# PARTE 4
## ✏️  Observaciones — Parte 4 
 
1.	Con join(), ¿el mensaje final siempre aparece al final? ¿Por qué? 
-	Si, siempre aparece al final, por que el join() obliga al hilo principal a pausar su ejecución y esperar a que los hilos secundarios finalicen.
      
2.	Con Thread.sleep(1000), ¿cuánto tarda en total la aplicación? ¿Coincide con el tiempo del temporizador más largo? 
-	En total tarda 8 segundos, lo que dure el temporizador mas largo, y si coincide con el temporizador mas largo que es de 8, esto sucede por que los hilos se ejecutan en paralelo y de forma independiente.
      
3.	¿Para qué sirve llamar Thread.currentThread().interrupt() dentro del catch de InterruptedException? 
-	Por que al llamar Interrpted Exception java por defecto limpia la bandera de interrumpcion del hilo, entonces el ThreadcurentThread ayuda a que este error dentro del hilo sea visible para otros métodos y partes del programa. 
      
