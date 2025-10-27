abstract class ComplexityTime<T extends any[]>{
    name: string;
    constructor(name: string) {
        this.name = name;
    }
    abstract run(...args: T): void;

    measure(...args: T):void{
        console.log(`\n Time Complexity executing for ${this.name} with N = ${args}`);
        const start = performance.now();
        this.run(...args);
        const finish = performance.now();
        console.log(`\n Time Calculated ${(finish - start).toFixed(4)} ms`);
    }
    
}

export default ComplexityTime;