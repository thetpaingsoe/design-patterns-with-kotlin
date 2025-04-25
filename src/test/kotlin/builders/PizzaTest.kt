package builders

import org.example.builders.CrustType
import org.example.builders.Size
import org.example.builders.Topping
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import kotlin.test.expect

class PizzaTest {
    @Test
    fun `builds pizza with default crust and no extra cheese`() {
        val pizza = Pizza.Builder(Size.SMALL).build()
        assertEquals(Size.SMALL, pizza.size)
        assertEquals(CrustType.THIN, pizza.crustType)
        assertEquals( setOf(), pizza.toppings)
        assertFalse { pizza.extraCheese }
    }

    @Test
    fun `builds pizza with extra cheese and thick crust`() {
        val pizza = Pizza.Builder(Size.LARGE)
            .setCrustType(CrustType.THICK)
            .addTopping(Topping.HAM)
            .setExtraCheese()
            .build()

        assertEquals(CrustType.THICK, pizza.crustType)
        assertTrue { pizza.extraCheese }
    }

    @Test
    fun `throws exception when more than 5 toppings are added`() {
        val pizza = Pizza.Builder(Size.MEDIUM)
            .addTopping(Topping.HAM)
            .addTopping(Topping.MUSHROOM)
            .addTopping(Topping.PEPPERS)
            .addTopping(Topping.PEPPERONI)
            .addTopping(Topping.PINEAPPLE)
            .addTopping(Topping.BACON)

        assertFailsWith<IllegalArgumentException> {
            pizza.build();
        }


    }
}