import { 
    ConstantTimeComplexity,
    LinearlyTimeComplexity,
    LogarithmTimeComplexity,
    LinearlyLogarithmComplexity,
    SquareLogarithmComplexity
} from "./ComplexityTypes.js";

const constantTimeComplexity = new ConstantTimeComplexity()
const linearlyTimeComplexity = new LinearlyTimeComplexity()
const logarithmTimeComplexity = new LogarithmTimeComplexity()
const linearlyLogarithmComplexity = new LinearlyLogarithmComplexity()
const squareLogarithmComplexity = new SquareLogarithmComplexity()

//constantTimeComplexity.measure([10])
//linearlyTimeComplexity.measure([1,5,3,7,4,7], 4)
//logarithmTimeComplexity.measure([1,2,3,4,5,6,7,8,9], 9)
//linearlyLogarithmComplexity.measure([1,2,3,4,5,6,7,8,9], [1,2,3,4,5,6,7,8,9])
//squareLogarithmComplexity.measure([1,2,3,4,5,6])