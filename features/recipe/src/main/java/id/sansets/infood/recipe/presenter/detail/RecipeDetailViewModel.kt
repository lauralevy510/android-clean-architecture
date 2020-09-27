package id.sansets.infood.recipe.presenter.detail

import androidx.lifecycle.ViewModel
import id.sansets.infood.core.domain.model.Ingredient
import id.sansets.infood.core.domain.model.Step
import id.sansets.infood.core.domain.usecase.CoreUseCase
import java.lang.StringBuilder
import java.util.*
import javax.inject.Inject

class RecipeDetailViewModel @Inject constructor(useCase: CoreUseCase) : ViewModel() {

    fun getFormattedSteps(steps: List<Step>): String {
        val stringBuilder = StringBuilder()

        steps.forEachIndexed { index, step ->
            if (index != steps.size - 1) {
                stringBuilder.append("${step.number}. ${step.step}")
                stringBuilder.append("\n")
            } else {
                stringBuilder.append("${step.number}. ${step.step}")
            }
        }

        return stringBuilder.toString()
    }

    fun getFormattedIngredients(ingredients: List<Ingredient>): String {
        val stringBuilder = StringBuilder()

        ingredients.forEachIndexed { index, ingredient ->
            if (index != ingredients.size - 1) {
                stringBuilder.append("- ${ingredient.name.capitalize(Locale.getDefault())}")
                stringBuilder.append("\n")
            } else {
                stringBuilder.append("- ${ingredient.name.capitalize(Locale.getDefault())}")
            }
        }

        return stringBuilder.toString()
    }
}