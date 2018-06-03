import _common.minus10
import _common.plus10
import _common.print
import io.reactivex.Observable

fun main(args: Array<String>) {
  val generator = Observable
      .fromIterable(1..5)
      .print()
      .doOnComplete { println("Complete") }

  val plus10 = generator
      .plus10()
      .print(spaces = 3)

  val minus10 = plus10
      .minus10()
      .print(spaces = 7)

  minus10
      .subscribe()

  Thread.sleep(2000)
}
