# PARTE 3
## ✏️  Observaciones — Parte 3 (Lambda) 
 
1.	¿Qué cambios hiciste en TimerTask.java? (Se espera: ninguno.) 
-	Ningun cambi, TimerTask queda tal como se creo originalmente.
      
2.	Escribe con tus propias palabras qué significa () -> timerA.run() 
-	Es una función sin nombre que define la tarea del hilo, () quiere decir q no recibe parámetros, -> separa la definición de la ejecución, y el timerA.run es la acción que el hilo debe ejecutar.
      
3.	¿Cuál de las tres alternativas consideras más legible? ¿Por qué? 
-	La alternativa de lambda, por que con esta alternativa el sistema es mas fácil de leer y entender, además de que podemos comprender de mejor forma cual es la tarea que se le esta enviando al hilo,  new Thread(() -> timerA.run(), "Hilo-A").start();
