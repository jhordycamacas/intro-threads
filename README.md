# PARTE 2
## ✏️  Observaciones — Parte 2 (implements Runnable) 
 
1.	¿En qué línea exacta del código ocurre la diferencia respecto a la Parte 1 en el main()? 
-	En la línea 12, ahora se necesita instanciar la clase Thread de forma explicita, y pasarle el objeto como parámetro.
      
2.	¿Por qué en esta versión escribimos new Thread(timerA, "Hilo-A").start() en lugar de timerA.start()? 
-	Por que TimerTask ya no es un hilo sino que es una tarea que un hilo puede ejecutar, ya no heredamos el método .start() y es necesario crear un objeto de la clase Thread.
      
3.	Si TimerTask necesitara extender otra clase, ¿podría seguir usando Runnable? Explica. 
-	Si por que Java permite implementar multiples interfaces aunque solo permita heredar de una sola clase, es decir, si usamos Runnable, la clase TimerTask queda libre para extender cualquier otra clase que necesite, manteniendo la capacidad de ejecutarse en un hilo independiente mediante la clase Thread.
