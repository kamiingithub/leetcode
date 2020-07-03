### 

模拟数值的加值，需要注意的是最大数值的处理，Number.MAX_SAFE_INTEGER


### Code

```typescript
/**
 * 进位制运算
 * 从各位开始计算
 * @time 2020.06.24 18:54
 * @runtime 72 ms, faster than 50.00% of TypeScript
 * @memory 33.9 MB, less than 100.00% of TypeScript
 */
const plusOne = (digits: number[]): number[] => {
  let integer = Number(digits.join(""));
  if (Number(digits.join("")) < Number.MAX_SAFE_INTEGER) {
    return String(integer + 1).split("").map((s) => Number(s));
  }

  let p: number = digits.length - 1;
  let last_computed_is_carry: boolean = false;
  while (p >= 0) {
    let d: number = digits[p] + 1;
    if (d === 10) {
      digits[p] = 0;
      last_computed_is_carry = true;
    } else {
      digits[p] = d;
      last_computed_is_carry = false;
      break;
    }
    p -= 1;
  }
  if (last_computed_is_carry) {
    digits = [1].concat(digits);
  }
  return digits;
};
```

### Testing

```typescript
import * as asserts from "https://deno.land/std/testing/asserts.ts";
import * as log from "https://deno.land/std/log/mod.ts";

import { plusOne } from "./index.ts";

log.info("0066 Plus One");

Deno.test({
  name: `
  Input: [0]
  Output: [1]
  Explanation: The array represents the integer 0.
  `,
  fn(): void {
    const result = plusOne([0]);
    asserts.assertEquals(result, [1]);
  },
});

Deno.test({
  name: `
  Input: [1,2,3]
  Output: [1,2,4]
  Explanation: The array represents the integer 123.
  `,
  fn(): void {
    const result = plusOne([1, 2, 3]);
    asserts.assertEquals(result, [1, 2, 4]);
  },
});

Deno.test({
  name: `
  Input: [4,3,2,1]
  Output: [4,3,2,2]
  Explanation: The array represents the integer 4321.
  `,
  fn(): void {
    const result = plusOne([4, 3, 2, 1]);
    asserts.assertEquals(result, [4, 3, 2, 2]);
  },
});

Deno.test({
  name: `
  Input: [6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3]
  Output: [6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 4]
  Explanation: The array represents the integer 6145390195186705543.
  `,
  fn(): void {
    const result = plusOne(
      [6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3],
    );
    asserts.assertEquals(
      result,
      [6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 4],
    );
  },
});

Deno.test({
  name: `
  Input: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
  Output: [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
  Explanation: The array represents the integer 99999999999999999999999.
  `,
  fn(): void {
    const result = plusOne(
      [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9],
    );
    asserts.assertEquals(
      result,
      [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
    );
  },
});
```