<template>
  <div class="re-item">
    <a :href="url" class="title-link">{{ name }}</a>

    <div class="results">
      <span v-for="(result, index) in results" :key="index" class="result">{{ result }}</span>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    name: String,
    url: String,
    results: Array,
  },
}
</script>

<style scoped>
.re-item {
  font-family: Arial, sans-serif;
  line-height: 1.5;
  max-width: 800px;
  padding: 10px;
}

.title-link {
  color: #1a0dab;
  font-size: 18px;
  text-decoration: none;
  font-weight: normal;
}

.results {
  display: flex;
  gap: 10px;
  justify-content: flex-start;
}
.result {
  color: #545454;
  font-size: 14px;
  margin-top: 5px;
}

.description strong {
  font-weight: bold;
  color: #545454;
}

.links {
  margin-top: 5px;
  font-size: 14px;
}

.links a {
  color: #1a0dab;
  text-decoration: none;
}

.links a:hover {
  text-decoration: underline;
}
</style>
