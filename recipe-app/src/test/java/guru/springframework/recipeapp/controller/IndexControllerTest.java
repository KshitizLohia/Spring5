package guru.springframework.recipeapp.controller;

import guru.springframework.recipeapp.models.Recipe;
import guru.springframework.recipeapp.repository.RecipeRepository;
import guru.springframework.recipeapp.service.RecipeService;
import guru.springframework.recipeapp.service.RecipeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;


    IndexController indexController;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);

    }


    @Test
    public void getIndexPage() {
        // given
        Set<Recipe> recipeSet = new HashSet<>();

        Recipe recipe = new Recipe();
        recipe.setId(1l);


        recipeSet.add(recipe);
        recipeSet.add(new Recipe());

        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);


        // when
        when(recipeService.getRecipes()).thenReturn(recipeSet);


        // then
        String view = indexController.getIndexPage(model);
        assertEquals(view, "index");
        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());

        Set<Recipe> values = argumentCaptor.getValue();
        assertEquals(2, values.size());

    }
}