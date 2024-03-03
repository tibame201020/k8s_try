import { defineStore } from 'pinia'

const apiUrl = import.meta.env.VITE_API_URL

export const useFetchStore = defineStore('fetchStore', {
  state: () => ({
    apiUrl: apiUrl,
    jpaData: [],
    r2dbcData: []

  }),
  actions: {
    async fetchJpa() {
      try {
        const response = await fetch(`${apiUrl}/api/jpa`)
        const data = await response.json()
        this.jpaData = data
      } catch (error) {
        console.error('error = ', error)
      }
    },
    async fetchR2() {
      try {
        const response = await fetch(`${apiUrl}/api/r2dbc`)
        const data = await response.json()
        this.r2dbcData = data
      } catch (error) {
        console.error('error = ', error)
      }
    }

  }

})
