<template>
    <div class="child-2">
        <p>in child2:</p>
        <p>props: {{pChild2}}</p>
        <p>$attrs: {{$attrs}}</p>
        <hr>
    </div>
</template>

<script>
    export default {
        name: 'Child2',
        props:['pChild2'],
        inheritAttrs: false,
        mounted() {
            this.$emit('test2')
        }
    }
</script>

<style scoped>

</style>