<script setup lang="ts">
import { useFetchStore } from './stores/fetchStore'

const fetchStore = useFetchStore()

fetchStore.fetchJpa()
fetchStore.fetchR2()

</script>

<template>
  <div class="container-fluid">
    <div class="row">
      <div class="col-12">
        <b>jpa:</b>
      </div>
      <div class="col-6" v-for="item in fetchStore.jpaData">
          {{ item }}
        </div>
    </div>
    <div class="row">
      <div class="col">
        <hr>
      </div>
    </div>
    <div class="row">
      <div class="col-12">
        <b>r2dbc:</b>
      </div>
      <div class="col-3" v-for="item in fetchStore.r2dbcData">
          {{ item }}
        </div>
    </div>
  </div>
</template>

<style scoped></style>