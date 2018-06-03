package _common

import io.reactivex.Observable

fun Observable<Int>.print(spaces: Int = 0): Observable<Int> {
  return this.doOnNext { println("${Thread.currentThread()} - ${" ".repeat(spaces)} $it") }
}

fun Observable<Int>.plus10(): Observable<Int> {
  return this
      .map { it + 10 }
}

fun Observable<Int>.minus10(): Observable<Int> {
  return this
      .map { it - 10 }
}
