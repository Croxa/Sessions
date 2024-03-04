package com.example.test.data.network

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.GoTrue

object SupabaseClient {
    val client = createSupabaseClient(
        supabaseUrl = "https://gkwhvihrwbhwtnghvztr.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imdrd2h2aWhyd2Jod3RuZ2h2enRyIiwicm9sZSI6InNlcnZpY2Vfcm9sZSIsImlhdCI6MTcwODUxMTU2MiwiZXhwIjoyMDI0MDg3NTYyfQ.5ybdP8NZroqHMcyQs1S5OfJZ_pFKEcYWX27QRmxQUSE"
    ) {
        install(GoTrue)
    }
}