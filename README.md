# PARTE 1
## ✏️  Observaciones — Parte 1 (extends Thread) 
 
1.	¿Los mensajes de los tres temporizadores aparecen entremezclados? ¿Qué indica eso? 
- Si los mensajes aparecen entremezclados, esto indica que el programa ahora es concurrente, es decir los hilos se están ejecutando de forma simultánea, y cada objeto tiene su propio flujo de ejecución.
      
2.	¿El orden de los mensajes es siempre el mismo entre ejecuciones? ¿Por qué? 
-	No, el orden no será siempre el mismo, por que los tres hilos se ejecutan a la vez y es el sistema operativo el que decide quien imprime primero. 
     
      
3.	¿Qué pasaría si TimerTask necesitara también extender una clase llamada Widget?
-	Esto es imposible por que Java no permite herencia multiple de clases.
      
