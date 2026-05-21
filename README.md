# Resumen
Este proyecto consiste en una aplicación de consola en Java orientada a la gestión de actividades (To-Do List).
El objetivo principal del ejercicio es aprender a manipular colecciones indexadas dinámicas mediante la clase ArrayList,
resolviendo de manera segura el desfase entre los índices de base cero ($0$) que utiliza la máquina y el formato de base uno ($1$) que espera el usuario final.
## Características
Estructura Dinámica Lineal: Utiliza ArrayList para permitir que el volumen de tareas crezca o disminuya en tiempo de ejecución sin las restricciones de tamaño fijo de un array convencional.Inserción Posicional Eficiente: Implementa sobrecarga de métodos (tareas.add(index, element)) para desplazar automáticamente los elementos existentes e inyectar datos en una coordenada intermedia.Validación Anticipada de Rangos: Previene excepciones críticas de desbordamiento en memoria (IndexOutOfBoundsException) mediante estructuras condicionales que delimitan los márgenes válidos de la colección.Conversión de Índices Humano-Máquina: Resta de forma sistemática un valor (posicion - 1)
antes de interactuar con la API de Java para mantener una experiencia de usuario natural e intuitiva.
