package com.github.eirslett.sc8

import com.github.eirslett.sc8.{
  Function0 => JavaFunction0,
  Function1 => JavaFunction1,
  Function2 => JavaFunction2,
  Function3 => JavaFunction3,
  Function4 => JavaFunction4,
  Function5 => JavaFunction5,
  Function6 => JavaFunction6,
  Function7 => JavaFunction7,
  Function8 => JavaFunction8,
  Function9 => JavaFunction9,
  Function10 => JavaFunction10,
  Function11 => JavaFunction11,
  Function12 => JavaFunction12,
  Function13 => JavaFunction13,
  Function14 => JavaFunction14,
  Function15 => JavaFunction15,
  Function16 => JavaFunction16,
  Function17 => JavaFunction17,
  Function18 => JavaFunction18,
  Function19 => JavaFunction19,
  Function20 => JavaFunction20,
  Function21 => JavaFunction21,
  Function22 => JavaFunction22
}

object Sc8 {
  def F[R](f: JavaFunction0[R]) = () => f()
  def F[T1, R](f: JavaFunction1[T1, R]) = (v1: T1) => f(v1)
  def F[T1, T2, R](f: JavaFunction2[T1, T2, R]) = (v1: T1, v2: T2) => f(v1, v2)
  def F[T1, T2, T3, R](f: JavaFunction3[T1, T2, T3, R]) = (v1: T1, v2: T2, v3: T3) => f(v1, v2, v3)
  def F[T1, T2, T3, T4, R](f: JavaFunction4[T1, T2, T3, T4, R]) = (v1: T1, v2: T2, v3: T3, v4: T4) => f(v1, v2, v3, v4)
  def F[T1, T2, T3, T4, T5, R](f: JavaFunction5[T1, T2, T3, T4, T5, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5) => f(v1, v2, v3, v4, v5)
  def F[T1, T2, T3, T4, T5, T6, R](f: JavaFunction6[T1, T2, T3, T4, T5, T6, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6) => f(v1, v2, v3, v4, v5, v6)
  def F[T1, T2, T3, T4, T5, T6, T7, R](f: JavaFunction7[T1, T2, T3, T4, T5, T6, T7, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7) => f(v1, v2, v3, v4, v5, v6, v7)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, R](f: JavaFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8) => f(v1, v2, v3, v4, v5, v6, v7, v8)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](f: JavaFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9) => f(v1, v2, v3, v4, v5, v6, v7, v8, v9)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R](f: JavaFunction10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10) => f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R](f: JavaFunction11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11) => f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R](f: JavaFunction12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12) => f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R](f: JavaFunction13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13) => f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R](f: JavaFunction14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14) => f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R](f: JavaFunction15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15) => f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R](f: JavaFunction16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15, v16: T16) => f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R](f: JavaFunction17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15, v16: T16, v17: T17) => f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R](f: JavaFunction18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15, v16: T16, v17: T17, v18: T18) => f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R](f: JavaFunction19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15, v16: T16, v17: T17, v18: T18, v19: T19) => f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R](f: JavaFunction20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15, v16: T16, v17: T17, v18: T18, v19: T19, v20: T20) => f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R](f: JavaFunction21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15, v16: T16, v17: T17, v18: T18, v19: T19, v20: T20, v21: T21) => f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21)
  def F[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R](f: JavaFunction22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15, v16: T16, v17: T17, v18: T18, v19: T19, v20: T20, v21: T21, v22: T22) => f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22)
  def C(c: Consumer0) = () => c()
  def C[T1](c: Consumer1[T1]) = (v1: T1) => c(v1)
  def C[T1, T2](c: Consumer2[T1, T2]) = (v1: T1, v2: T2) => c(v1, v2)
  def C[T1, T2, T3](c: Consumer3[T1, T2, T3]) = (v1: T1, v2: T2, v3: T3) => c(v1, v2, v3)
  def C[T1, T2, T3, T4](c: Consumer4[T1, T2, T3, T4]) = (v1: T1, v2: T2, v3: T3, v4: T4) => c(v1, v2, v3, v4)
  def C[T1, T2, T3, T4, T5](c: Consumer5[T1, T2, T3, T4, T5]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5) => c(v1, v2, v3, v4, v5)
  def C[T1, T2, T3, T4, T5, T6](c: Consumer6[T1, T2, T3, T4, T5, T6]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6) => c(v1, v2, v3, v4, v5, v6)
  def C[T1, T2, T3, T4, T5, T6, T7](c: Consumer7[T1, T2, T3, T4, T5, T6, T7]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7) => c(v1, v2, v3, v4, v5, v6, v7)
  def C[T1, T2, T3, T4, T5, T6, T7, T8](c: Consumer8[T1, T2, T3, T4, T5, T6, T7, T8]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8) => c(v1, v2, v3, v4, v5, v6, v7, v8)
  def C[T1, T2, T3, T4, T5, T6, T7, T8, T9](c: Consumer9[T1, T2, T3, T4, T5, T6, T7, T8, T9]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9) => c(v1, v2, v3, v4, v5, v6, v7, v8, v9)
  def C[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](c: Consumer10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10) => c(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
  def C[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](c: Consumer11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11) => c(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
  def C[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](c: Consumer12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12) => c(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
  def C[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](c: Consumer13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13) => c(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
  def C[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](c: Consumer14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14) => c(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
  def C[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](c: Consumer15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15) => c(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
  def C[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](c: Consumer16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15, v16: T16) => c(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
  def C[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](c: Consumer17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15, v16: T16, v17: T17) => c(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17)
  def C[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](c: Consumer18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15, v16: T16, v17: T17, v18: T18) => c(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18)
  def C[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](c: Consumer19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15, v16: T16, v17: T17, v18: T18, v19: T19) => c(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19)
  def C[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](c: Consumer20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15, v16: T16, v17: T17, v18: T18, v19: T19, v20: T20) => c(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20)
  def C[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](c: Consumer21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15, v16: T16, v17: T17, v18: T18, v19: T19, v20: T20, v21: T21) => c(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21)
  def C[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](c: Consumer22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]) = (v1: T1, v2: T2, v3: T3, v4: T4, v5: T5, v6: T6, v7: T7, v8: T8, v9: T9, v10: T10, v11: T11, v12: T12, v13: T13, v14: T14, v15: T15, v16: T16, v17: T17, v18: T18, v19: T19, v20: T20, v21: T21, v22: T22) => c(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22)
}