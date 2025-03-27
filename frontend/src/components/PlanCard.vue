<!-- PlanCard.vue -->
<template>
  <div class="plan-card">
    <div class="plan-header">
      <div class="badge">{{ vendor }}</div>
      <h2>{{ name }}</h2>
      <ul class="features">
        <li>
          <img src="../assets/download.png" />
          <div>
            <strong>{{ download }}</strong
            ><br />Max download speed to your hub
          </div>
        </li>
        <li>
          <img src="../assets/upload.png" />
          <div>
            <strong>{{ upload }}</strong
            ><br />Max upload speed to your hub
          </div>
        </li>
        <li>
          <img src="../assets/unlimited.png" />
          <div><strong>Unlimited</strong><br />Monthly usage</div>
        </li>
        <li>
          <img src="../assets/hub.png" />
          <div><strong>Giga Hub</strong><br />Wi-Fi 6E included</div>
        </li>
      </ul>
    </div>
    <div class="plan-footer">
      <p>
        {{ additionalFeatures }}
      </p>
      <p class="price">{{ price }}</p>
      <p class="regular">{{ specialServices }}</p>
    </div>
  </div>
</template>

<script setup>
defineProps({
  name: String,
  vendor: String,
  download: String,
  upload: String,
  additionalFeatures: String,
  price: String,
  specialServices: String,
})
</script>

<style scoped>
.plan-card {
  background: white;
  border-radius: 12px;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
  width: 300px;
  display: flex;
  flex-direction: column;
  overflow: hidden;
}

.plan-header {
  padding: 20px;
}

.badge {
  display: inline-block;
  background: #007bff;
  color: white;
  font-size: 12px;
  padding: 4px 8px;
  border-radius: 4px;
  margin-bottom: 10px;
}

h2 {
  margin: 0;
  font-size: 22px;
}

.features {
  list-style: none;
  padding: 0;
  margin-top: 20px;
}

.features li {
  display: flex;
  gap: 12px;
  align-items: flex-start;
  margin-bottom: 15px;
}

.features img {
  width: 28px;
  height: 28px;
}

.plan-footer {
  background: #f4f4f4;
  padding: 16px;
  font-size: 14px;
  color: #333;
}

.highlight {
  color: #007bff;
  font-weight: bold;
}

.price {
  font-size: 24px;
  color: #004aad;
  font-weight: bold;
  margin: 8px 0;
}

.regular {
  font-size: 12px;
  color: #777;
}
</style>
