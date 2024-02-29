import request from '@/utils/request'

export function list(query){
  return request({
    url: '/vUiEquipment/list',
    method: 'get',
    params: query
  })
}

export function add(data) {
  return request({
    url: '/vUiEquipment/save',
    method: 'post',
    data: data
  })
}

export function remove(data) {
  return request({
    url: '/vUiEquipment/remove',
    method: 'post',
    data: data
  })
}


export function update(data) {
  return request({
    url: '/vUiEquipment/update',
    method: 'post',
    data: data
  })
}

