<template>
  <div class="table-wrapper" v-if="textItems && textItems.length > 0">
    <table class="modern-table">
      <thead>
        <tr>
          <th>Url</th>
          <th>Occurrences</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(textItem, index) in textItems" :key="index">
          <td>{{ textItem.url }}</td>
          <td>
            {{ textItem.occurrences }}
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  name: 'ModernTable',
  props: {
    textItems: Array,
  },
  methods: {},
}
</script>

<style scoped>
.table-wrapper {
  margin: 40px auto;
  font-family: 'Segoe UI', Tahoma, sans-serif;
}

.modern-table {
  width: 100%;
  border-collapse: collapse;
  border-radius: 8px;
  overflow: hidden;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.05);
}

.modern-table th,
.modern-table td {
  padding: 14px 16px;
  text-align: left;
  border-bottom: 1px solid #eee;
}

.modern-table th:first-child,
.modern-table td:first-child {
  width: 80%;
}

.modern-table tr:hover {
  background-color: #f9f9f9;
}
</style>
