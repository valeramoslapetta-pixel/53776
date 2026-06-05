import CalculatorLexer from "./generated/CalculatorLexer.js";
import CalculatorParser from "./generated/CalculatorParser.js";
import CustomCalculatorVisitor from "./CustomCalculatorVisitor.js";
import antlr4, { CharStreams, CommonTokenStream, ParseTreeWalker } from "antlr4";
import readline from 'readline';
import fs from 'fs';

async function main() {
    let input;



const archivoEntrada = process.argv[2] || 'input.txt';

try {
    input = fs.readFileSync(archivoEntrada, 'utf8');
    console.log(`\nArchivo de entrada: ${archivoEntrada}`);
} catch (err) {
    console.error(`No se pudo abrir el archivo: ${archivoEntrada}`);
    return;
}

    let inputStream = CharStreams.fromString(input);
let lexer = new CalculatorLexer(inputStream);
let tokenStream = new CommonTokenStream(lexer);

tokenStream.fill();

console.log("\n=== TABLA DE LEXEMAS Y TOKENS ===");
console.log("LEXEMA\t\tTOKEN");

for (const token of tokenStream.tokens) {
    if (token.type !== antlr4.Token.EOF) {
        const tokenName = CalculatorLexer.symbolicNames[token.type];
        console.log(`${token.text}\t\t${tokenName}`);
    }
}

let parser = new CalculatorParser(tokenStream);
    let tree = parser.programa();
    
    
    if (parser.syntaxErrorsCount > 0) {
        console.error("\nSe encontraron errores de sintaxis en la entrada.");
    } 
    else {
        console.log("\nEntrada válida.");
        const cadena_tree = tree.toStringTree(parser.ruleNames);
        console.log(`Árbol de derivación: ${cadena_tree}`);

        const visitor = new CustomCalculatorVisitor();
const codigoJS = visitor.visit(tree);

console.log("\n=== CÓDIGO JAVASCRIPT GENERADO ===");
console.log(codigoJS);

console.log("\n=== EJECUCIÓN ===");
eval(codigoJS); 
    }
}

function leerCadena() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    return new Promise(resolve => {
        rl.question("Ingrese una cadena: ", (answer) => {
            rl.close();
            resolve(answer);
        });
    });
}


main();
