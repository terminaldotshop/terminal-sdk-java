// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.AddressCreateParams
import shop.terminal.api.models.AddressCreateResponse
import shop.terminal.api.models.AddressDeleteParams
import shop.terminal.api.models.AddressDeleteResponse
import shop.terminal.api.models.AddressListParams
import shop.terminal.api.models.AddressListResponse

interface AddressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create and add a shipping address to the current user. */
    @JvmOverloads
    fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressCreateResponse>

    /** Get the shipping addresses associated with the current user. */
    @JvmOverloads
    fun list(
        params: AddressListParams = AddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressListResponse>

    /** Get the shipping addresses associated with the current user. */
    fun list(requestOptions: RequestOptions): CompletableFuture<AddressListResponse> =
        list(AddressListParams.none(), requestOptions)

    /** Delete a shipping address from the current user. */
    @JvmOverloads
    fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressDeleteResponse>

    /**
     * A view of [AddressServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /address`, but is otherwise the same as
         * [AddressServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: AddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /address`, but is otherwise the same as
         * [AddressServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AddressListParams = AddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressListResponse>>

        /**
         * Returns a raw HTTP response for `get /address`, but is otherwise the same as
         * [AddressServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AddressListResponse>> =
            list(AddressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /address/{id}`, but is otherwise the same as
         * [AddressServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: AddressDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>>
    }
}
