// src/ComplexityTimesExamples/ComplexityTime.ts
var ComplexityTime = class {
  constructor(name) {
    this.name = name;
  }
  measure(...args) {
    console.log(`
 Time Complexity executing for ${this.name} with N = ${args}`);
    const start = performance.now();
    this.run(...args);
    const finish = performance.now();
    console.log(`
 Time Calculated ${(finish - start).toFixed(4)} ms`);
  }
};
var ComplexityTime_default = ComplexityTime;

// src/ComplexityTimesExamples/ComplexityTypes.ts
var ConstantTimeComplexity = class extends ComplexityTime_default {
  constructor() {
    super("O(1) - Constant Time Complexity");
  }
  run(numbers) {
    console.log("\n " + numbers[0]);
  }
};
var LinearlyTimeComplexity = class extends ComplexityTime_default {
  constructor() {
    super("O(n) - Linearly Time Complexity");
  }
  run(numbers, target) {
    numbers.forEach((element, index) => {
      if (element === target) console.log("\n Target in position " + index);
    });
  }
};
var LogarithmTimeComplexity = class extends ComplexityTime_default {
  constructor() {
    super("O(Log n) - Time Complexity");
  }
  run(numbers, target) {
    let left = 0, right = numbers.length - 1;
    let position = -1;
    while (left <= right) {
      let mid = Math.round((left + right) / 2);
      if (numbers[mid] === target) {
        position = mid;
        break;
      } else if (numbers[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    console.log("\n El valor de position es: " + position);
  }
};
var LinearlyLogarithmComplexity = class extends ComplexityTime_default {
  constructor() {
    super("O(n Log n) - Linearly Logarithm Time Complexity");
  }
  run(numbers, numbersToFind) {
    numbersToFind.forEach((element) => {
      this.binarySearch(numbers, element);
    });
  }
  binarySearch(numbers, target) {
    let left = 0, right = numbers.length - 1;
    let position = -1;
    while (left <= right) {
      let mid = Math.round((left + right) / 2);
      if (numbers[mid] === target) {
        position = mid;
        break;
      } else if (numbers[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    console.log(" El valor de position es: " + position);
  }
};
var SquareLogarithmComplexity = class extends ComplexityTime_default {
  constructor() {
    super("O(n*n) - Square Time Complexity");
  }
  run(array) {
    array.forEach((i) => {
      array.forEach((j) => {
        console.log(i * j);
      });
    });
  }
};

// src/ComplexityTimesExamples/index.ts
var example = new ConstantTimeComplexity();
var example2 = new LinearlyTimeComplexity();
var example3 = new LogarithmTimeComplexity();
var example4 = new LinearlyLogarithmComplexity();
var example5 = new SquareLogarithmComplexity();
example5.measure([1, 2, 3, 4, 5, 6]);
