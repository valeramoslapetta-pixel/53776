import CalculatorVisitor from './generated/CalculatorVisitor.js';

export default class CustomCalculatorVisitor extends CalculatorVisitor {

    visitPrograma(ctx) {
        return this.visit(ctx.instrucciones());
    }

    visitInstrucciones(ctx) {
        let codigo = "";

        for (let instruccion of ctx.instruccion()) {
            codigo += this.visit(instruccion) + "\n";
        }

        return codigo;
    }

    visitInstruccion(ctx) {
        return this.visitChildren(ctx);
    }

    visitSalida(ctx) {
        const texto = ctx.cadena().getText();
        return `console.log(${texto});`;
    }

    visitBucle(ctx) {
        const condicion = ctx.condicion().getText();
        const instrucciones = this.visit(ctx.instrucciones());

        return `while(${condicion}) {\n${instrucciones}}`;
    }
}