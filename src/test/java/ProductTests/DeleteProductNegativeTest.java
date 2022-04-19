package ProductTests;

import api.ProductService;
import lombok.SneakyThrows;
import okhttp3.ResponseBody;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import retrofit2.Response;
import utils.RetrofitUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DeleteProductNegativeTest {
    static ProductService productService;
    @BeforeAll
    static void beforeAll() {productService = RetrofitUtils.getRetrofit().create(ProductService.class);
    }

    @Test
    @SneakyThrows
    void deleteNegativeTest() {
        Response<ResponseBody> response = productService.deleteProduct(50000).execute();
        assertThat(response.isSuccessful(), CoreMatchers.is(false));
        assertThat(response.code(), equalTo(500));
    }
}
