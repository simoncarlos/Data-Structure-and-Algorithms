import ComplexityTime from "./ComplexityTime.js";

// O(1)
export class ConstantTimeComplexity extends ComplexityTime<[number[]]>{
    constructor(){
        super("O(1) - Constant Time Complexity")
    }
    run(numbers: number[]): void {
        console.log("\n " + numbers[0]);
    }
}

// O(n)
export class LinearlyTimeComplexity extends ComplexityTime<[number[], number]>{
    constructor(){
        super("O(n) - Linearly Time Complexity")
    }
    run(numbers: number[], target:number): void{
        numbers.forEach( (element, index )=> {
            if(element === target) console.log("\n Target in position " + index)
        });
    }
}

// O(Log n)
export class LogarithmTimeComplexity extends ComplexityTime<[number[], number]>{
    constructor(){
        super("O(Log n) - Time Complexity")
    }
    run(numbers: number[], target: number): void{
        let left:number = 0, right:number = numbers.length - 1;
        let position:number = -1 ;

        while(left <= right){
            let mid:number = Math.round((left+right) / 2 )
            if(numbers[mid] === target){
                position=mid
                break;
            }else if(numbers[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        console.log("\n El valor de position es: " + position)
    }
}

// O(n Log n)
export class LinearlyLogarithmComplexity extends ComplexityTime<[number[], number[]]>{

    constructor(){
        super("O(n Log n) - Linearly Logarithm Time Complexity")
    }
    run(numbers: number[], numbersToFind: number[]): void{
        numbersToFind.forEach(element => {
            this.binarySearch(numbers, element)
        });
    }
    private binarySearch(numbers: number[], target: number):void{
        let left:number = 0, right:number = numbers.length - 1;
        let position:number = -1 ;

        while(left <= right){
            let mid:number = Math.round((left+right) / 2 )
            if(numbers[mid] === target){
                position=mid
                break;
            }else if(numbers[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        console.log(" El valor de position es: " + position)
    }

}

// O(n*n)

export class SquareLogarithmComplexity extends ComplexityTime<[number[]]>{
    constructor(){
        super("O(n*n) - Square Time Complexity")
    }
    run(array: number[]):void{
        array.forEach(i => {
            array.forEach( j => {
                console.log(i*j)
            })
        });
    }
}

