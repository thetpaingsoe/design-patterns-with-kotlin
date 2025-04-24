package builders
import org.example.builders.Size
import org.example.builders.CrustType
import org.example.builders.Topping

class Pizza private constructor(
    val size: Size,
    val crustType: CrustType,
    val toppings: Set<Topping>,
    val extraCheese: Boolean
){
    class Builder(private val size: Size) {
        private var crustType: CrustType = CrustType.THIN
        private var toppings : MutableSet<Topping> = mutableSetOf()
        private var extraCheese: Boolean = false

        fun setCrustType(type: CrustType) = apply { this.crustType = type }
        fun addTopping(topping: Topping) = apply { toppings.add(topping) }
        fun setExtraCheese() = apply { extraCheese = true }

        fun build() : Pizza {
            require(toppings.size <= 5) { "Max 5 toppings allowed. "}
            return Pizza(size, crustType, toppings.toSet(), extraCheese)
        }
    }

    override fun toString(): String {
        return "Size : $size, CrustType : $crustType, Toppings: $toppings, ExtraCheese: $extraCheese"
    }
}

fun main()  {
    val hawaiianPizza = Pizza.Builder(Size.MEDIUM)
        .setCrustType(CrustType.THICK)
        .addTopping(Topping.MUSHROOM)
        .addTopping(Topping.HAM)
        .addTopping(Topping.PINEAPPLE)
        .setExtraCheese()
        .build()

    print(hawaiianPizza)
}