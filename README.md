Este proyecto implementa un analizador lexico, sintactico y semantico utilizando antlr4 y javaScript.
El lenguaje analizado reconoce las siguientes estructuras:
Bucle while
while(0){
    printf("hola");
}
Salida por pantalla
printf("hola");

El analizador realiza:

Reconocimiento léxico.
Reconocimiento sintáctico.
Generación de tabla Lexema-Token.
Construcción del árbol de derivación.
Traducción a JavaScript.
Ejecución del código traducido.

Instalación

Clonar el repositorio:
git clone el linck

Ingresar al directorio del proyecto:
cd ssl-antlr-calculator

Instalar dependencias:
npm install


Ejecución

Editar el archivo:
input.txt

colocando una entrada válida o inválida, puede utilizar cualquiera de los 4 ejemplos del archivo, ya sean correctos o incorrectos.

Ejecutar:
npm start


Salida del programa

El programa muestra:
Tabla de Lexemas y Tokens.
Validación sintáctica.
Árbol de derivación.
Código JavaScript generado.
Resultado de la ejecución.


Autor:
Alumno: Valentin Ramos
Legajo: 53776